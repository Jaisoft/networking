


https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/client-authentication.html#mutual

To generate the server and client certificates and keys and upload them to ACM

Clone the OpenVPN easy-rsa repo to your local computer and navigate to the easy-rsa/easyrsa3 folder.

$ git clone https://github.com/OpenVPN/easy-rsa.git
$ cd easy-rsa/easyrsa3
Initialize a new PKI environment.

$ ./easyrsa init-pki
To build a new certificate authority (CA), run this command and follow the prompts.

$ ./easyrsa build-ca nopass
Generate the server certificate and key.

$ ./easyrsa build-server-full server nopass
Generate the client certificate and key.

Make sure to save the client certificate and the client private key because you will need them when you configure the client.

$ ./easyrsa build-client-full client1.domain.tld nopass
You can optionally repeat this step for each client (end user) that requires a client certificate and key.

Copy the server certificate and key and the client certificate and key to a custom folder and then navigate into the custom folder.

Before you copy the certificates and keys, create the custom folder by using the mkdir command. The following example creates a custom folder in your home directory.

$ mkdir ~/jaisoft-acm/
$ cp pki/ca.crt ~/jaisoft-acm/
$ cp pki/issued/server.crt ~/jaisoft-acm/
$ cp pki/private/server.key ~/jaisoft-acm/
$ cp pki/issued/client1.domain.tld.crt ~/jaisoft-acm/
$ cp pki/private/client1.domain.tld.key ~/jaisoft-acm/
$ cd ~/jaisoft-acm/


server

aws acm import-certificate --certificate fileb://server.crt --private-key fileb://server.key --certificate-chain fileb://ca.crt




client


aws acm import-certificate --certificate fileb://client1.domain.tld.crt --private-key fileb://client1.domain.tld.key --certificate-chain fileb://ca.crt



Export vpn config with certificates.

aws ec2 export-client-vpn-client-configuration \
    --client-vpn-endpoint-id cvpn-endpoint-06082b023738dfb52 \
    --output text



# AWS Client VPN Terraform example

An working example how to configure an AWS Client VPN with terraform.

**Important:** The included certificates shouldn't be used beside doing
a proof of concept or playing around with terraform!

## Basic usage

1. Setup AWS Credentials for your CLI (look at the [documentation](https://registry.terraform.io/providers/hashicorp/aws/latest/docs/guides/version-3-upgrade#provider-authentication-updates) for more details)
1. Change the domain name in the `vpn.tf` where you are having access to (this is needed for the DNS verification)
1. perform `terraform init`
1. perform `terraform apply`
1. download the profile from aws
1. fix the certificate section within the profile (remove the third certificate and add the certificates from `ca-chain.crt` and `client-vpn-ca.crt`)
1. connect with your vpn client (e.g. openvpn) `openvpn --config downloaded-client-config.ovpn --pkcs12 certs/client.p12`

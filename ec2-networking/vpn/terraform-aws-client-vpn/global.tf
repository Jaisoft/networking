terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 4.34.0"
    }
  }

  required_version = ">= 1.1.2"
}



variable "my_access_key" {
  description = "Access-key-for-AWS"
  default = "no_access_key_value_found"
}
 
variable "my_secret_key" {
  description = "Secret-key-for-AWS"
  default = "no_secret_key_value_found"
}

data "aws_availability_zones" "available" {
  state = "available"
}

locals {
  region = "eu-west-3" //Paris
  global_tags = {
    "environment" = "vpn-example"
  }
  availability_zones = sort(data.aws_availability_zones.available.names)
}



 
provider "aws" {
	
  region = local.region
  access_key = var.my_access_key
	secret_key = var.my_secret_key
        
}

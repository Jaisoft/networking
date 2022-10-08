
import { Component } from '@angular/core';
import { Post } from './post';
import { RestclientService } from './restclient.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  title = 'angular-http-client';

  private post: Post | undefined;

 
  constructor(private pepe: RestclientService){

     this.pepe.getProducts();
  }

  
}

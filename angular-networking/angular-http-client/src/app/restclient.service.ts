import { HttpClient } from  '@angular/common/http';

import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RestclientService {

  private url = "'https://jsonplaceholder.typicode.com/posts/1'";

  constructor(private http: HttpClient) { }

  getProducts() {
    return this.http.get(this.url);
  }
}

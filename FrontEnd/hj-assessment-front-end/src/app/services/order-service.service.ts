import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { OrderForm } from '../../data/orderForm';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {
	
  //Normally you'd want these defined in a call to the server or environment variables, but
  //obviously this is just a demo project
  hostname: string = 'http://localhost:8080/';
  retrievePath: string = 'retrieveOrder';
  saveOrderPath: string = 'saveOrder';
	
  //Standard simple header should be the only thing needed here.
  httpHeaders = {
   	headers: new HttpHeaders({
   		Accept: '*/*',
   		'Content-Type': 'application/json' })
  };

  constructor( private http: HttpClient) { }
  
  getOrder(lastName: string, orderNumber: string): Observable<OrderForm> {
	  const url: string = this.hostname + this.retrievePath;
	  let parameters = new HttpParams().append("lastName", lastName).append("orderNumber", orderNumber);
	  
	  return this.http.get<OrderForm>(url, {params:parameters});
  }
  
  submitOrder(order: OrderForm): Observable<any> {
	  const url = this.hostname + this.saveOrderPath;  
	  return this.http.post<OrderForm>(url, order, this.httpHeaders);
  }
  
}

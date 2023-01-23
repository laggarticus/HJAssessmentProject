import { Component } from '@angular/core';
import { OrderServiceService } from '../services/order-service.service';
import { OrderForm } from '../../data/orderForm';
import { map } from 'rxjs/operators'

@Component({
  selector: 'app-order-lookup',
  templateUrl: './order-lookup.component.html',
  styleUrls: ['./order-lookup.component.scss']
})
export class OrderLookupComponent {
	
	lastName: string = '';
	orderNumber: string = '';
	
	isErrorFound: boolean = false;
	isSubmitted: boolean = false;
	
	orderForm: OrderForm = {
			ordr_id: null,
		    firstName: '',
		    lastName: '',
		    grade: '',
		    address1: '',
		    address2: '',
		    city: '',
		    state: '',
		    zip: '',
	}
	
	constructor(private orderService: OrderServiceService) {}

	submit() {
		this.orderService.getOrder(this.lastName, this.orderNumber).subscribe((resp: any) => {
			if (resp){
				this.orderForm = resp;
			} else {
				this.isErrorFound = true;		
			}
		});
		this.isSubmitted = true;
	}
	
	private mapOrderForm() {
		
	}
}

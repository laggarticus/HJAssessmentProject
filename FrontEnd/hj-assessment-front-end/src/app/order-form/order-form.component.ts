import { Component } from '@angular/core';
import { constants } from '../../data/constants';
import { OrderForm } from '../../data/orderForm';
import { OrderServiceService } from '../services/order-service.service';

@Component({
  selector: 'app-order-form',
  templateUrl: './order-form.component.html',
  styleUrls: ['./order-form.component.scss']
})
export class OrderFormComponent {
	
	stateOptions = constants.STATELIST;
	gradeOptions = constants.GRADES;
	
	isSubmitted = false;
	orderNumber = null;
	
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
		//Easier than mapping and quicker to get done.
		this.orderService.submitOrder(this.orderForm).subscribe((resp: any) => {
			this.orderNumber = resp;
		});
		this.isSubmitted = true;	
	}
	
}

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'hj-assessment-front-end';
}

/*  Ultimate bare-bones app here. There's a lot of little nagging things that drive me nuts, like the fact that I wasn't able to implement a form reset for
	the main page to ensure that the user can resubmit each component more than once without having to refresh the page, but I have found Angular to be a bit 
	persnickity on that front. I've had to fix that a few times in the past but I was starting to work far too long on this what with my having to constantly 
	refer back to my notes on building everything from scratch.  And... even though I am not very imaginitive on making things look snazzy with CSS, I don't 
	think I used any styling at all and that bothers me a lot.  But CSS always drives me insane and I had already spent longer than I intended to in order to 
	get the site to this state.
*/
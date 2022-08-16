import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'RetirementCalculator';
  monthlyExpenses: number = 0;
  monthlyIncome: number = 0;

  getAnswer(): number {
   return (12* (this.monthlyExpenses - this.monthlyIncome)) * 33;
   // Reactive forms are better!
  }
}

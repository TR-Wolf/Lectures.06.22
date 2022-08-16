import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-navigation-menu',
  templateUrl: './navigation-menu.component.html',
  styleUrls: ['./navigation-menu.component.css']
})
export class NavigationMenuComponent implements OnInit {

  link1Name = 'Google.com';

  @Input()
  answer = 0;

  constructor() { }

  ngOnInit(): void {
  }

  ohMyGoshItWasClicked(wordEmitted: string): void {
    console.log("OH MY GOSH!", wordEmitted);
  }
}

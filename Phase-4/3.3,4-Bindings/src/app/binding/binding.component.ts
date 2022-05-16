import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  name:string="Nikunj Soni";
  url:string ="https://www.google.com";
  we:number=700;
  products=[

    {name:"pencil",price:"8.2",available:"04-04-2022",rating:"4.3"},
    {name:"eraser",price:"10",available:"05-04-2022",rating:"5.0"},
    {name:"pen",price:"15",available:"04-07-2022",rating:"4.9"},
    {name:"scale",price:"25",available:"04-02-2022",rating:"4.2"}

  ]

  flag=false;
  show(){
    this.flag=!this.flag;
  }

}


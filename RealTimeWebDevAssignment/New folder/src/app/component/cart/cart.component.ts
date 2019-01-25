import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {
  books:any;

  constructor(private bookService:BookService) { }

  ngOnInit() {


    this.bookService.getAllBooksFromCart().subscribe((response)=>{
      if(response && response.length>0){
         this.books=response;
        }
       console.log(response)});
  }

}
import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  books: any = [];
  id:string;
  bookName:string;
  description:string;
  authorName:string;
  price:number;

  constructor(private bookService: BookService) { }

  ngOnInit() {
    // this.bookService.getAllBooks().subscribe((response => {
    //     console.log(response);
    //     if(response && response.length > 0){
    //       this.books = response;
    //     }
    // }));
  }

  postData(){
    const book = new Book(this.id,this.bookName,this.description,this.authorName,this.price);
    this.bookService.addBook(book).subscribe((response)=>{
      console.log(response);
    });

    console.log(this.id);
  }

}

import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {

  books:any;

  constructor(private bookService:BookService) { }

  ngOnInit() {
    // this.bookService.getOneBook().subscribe((response) => {
    //   if(response){
    //     this.book=response;
    //   }
    // }
    //  );
    this.bookService.getAllBooks().subscribe((response) => {
      console.log(response);
      if(response && response.length > 0){
        this.books = response;
      }
  });
  }

  checkout(book){
    //   const book=new Book(this.id,this.title,this.desc,this.author,this.price);
       this.bookService.addBookToCart(book).subscribe((response)=>{
         console.log(response);
       });
     }
  

}

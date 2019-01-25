import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BookService } from 'src/app/providers/book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.scss']
})
export class BookComponent implements OnInit {

  book:any;
  bookId:any;

  constructor(private route: ActivatedRoute,private bookService : BookService) { }

  ngOnInit() {
    this.bookId=this.route.snapshot.paramMap.get('id');
  }

}

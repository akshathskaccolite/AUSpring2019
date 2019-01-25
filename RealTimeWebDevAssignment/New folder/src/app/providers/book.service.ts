import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) {

   }

   getAllBooks(): Observable<any> {
     return this.http.get('/library/books');
   }

   getOneBook(): Observable<any> {
    return this.http.get('/library/OneBook');
  }

  addBook(book:any):Observable<any>{
    return this.http.post('/library/books',book);
  }

  getAllBooksFromCart(): Observable<any> {
    return this.http.get('/library/cart');
  }

  addBookToCart(book:any):Observable<any>{
    return this.http.post('/library/cart',book);
  }
}

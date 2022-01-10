import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class StudentserviceService {
  url ="http://localhost:8000/api/student";

  constructor(private http:HttpClient) { }

  getData(){
    return this.http.get(this.url);
  }
}

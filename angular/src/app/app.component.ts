import { Component } from '@angular/core';
import { StudentserviceService } from './studentservice.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'StudentGrade';
  studentdata:any=[];
constructor(private student: StudentserviceService) { }

  ngOnInit(): void {
  this.student.getData().subscribe((result:any)=>{
    console.log(result);
    this.studentdata=result;
  })

  }

}

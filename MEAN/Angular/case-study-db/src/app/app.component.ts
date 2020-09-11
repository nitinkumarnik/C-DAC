import { Component } from '@angular/core';
import { CsdbService } from './csdb.service';
import { Logininfo, LogininfoFromServer } from './logininfo';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'case-study-db';
  show = '';
  isLogged = false;
  log:Logininfo;
  
  constructor(private sobj: CsdbService,private router:Router) {
    this.log = new Logininfo();
    this.log.userid;
    this.log.password;
  }

  submit() {
    this.sobj.ajaxLoginCall(this.log).subscribe(
      (data:LogininfoFromServer) => {
        if (data.isLogin) {
          this.router.navigate(['/search-options']);
          this.show = 'Logged in.';
          this.isLogged = data.isLogin;
        }
        else
          this.show = 'Wrong combination';
      },
      (error) => {}
    );
    this.log.userid = '';
    this.log.password = '';
  }

  reset() {
    this.log.userid = '';
    this.log.password = '';
    this.show = '';
  }

}

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifyTabComponent } from './modify-tab.component';

describe('ModifyTabComponent', () => {
  let component: ModifyTabComponent;
  let fixture: ComponentFixture<ModifyTabComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifyTabComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifyTabComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { CheckbookRequestsComponent } from './checkbook-requests.component';

describe('CheckbookRequestsComponent', () => {
  let component: CheckbookRequestsComponent;
  let fixture: ComponentFixture<CheckbookRequestsComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ CheckbookRequestsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckbookRequestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { TransferBetweenAccountsComponent } from './transfer-between-accounts.component';

describe('TransferBetweenAccountsComponent', () => {
  let component: TransferBetweenAccountsComponent;
  let fixture: ComponentFixture<TransferBetweenAccountsComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ TransferBetweenAccountsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TransferBetweenAccountsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

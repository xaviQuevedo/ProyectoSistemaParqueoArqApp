import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { VisualizadorPage } from './visualizador.page';

describe('VisualizadorPage', () => {
  let component: VisualizadorPage;
  let fixture: ComponentFixture<VisualizadorPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VisualizadorPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(VisualizadorPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { Component, OnInit } from '@angular/core';
import Map from 'ol/Map';
import View from 'ol/View';
import OSM from 'ol/source/OSM';
import 'ol/ol.css';
import TileLayer from 'ol/layer/Tile';
import Point from 'ol/geom/Point';
import Feature from 'ol/Feature';
import Vector from 'ol/source/Vector';
import LVector from 'ol/layer/Vector';
import { fromLonLat } from 'ol/proj';

@Component({
  selector: 'app-visualizador',
  templateUrl: './visualizador.page.html',
  styleUrls: ['./visualizador.page.scss'],
})
export class VisualizadorPage implements OnInit {

    map: Map;
    constructor() { }

    ngOnInit() {
        //this.makemap();
    }

    ionViewDidEnter() {
        this.makemap();
    }

    makemap() {
        var source = new OSM();
        var layer = new TileLayer();
        var position = fromLonLat([-79.2042236, -3.99313]);
        var view = new View({ center: position, zoom: 6 });
        this.map = new Map({ layers: [layer], view: view });
        console.log('sale');
        this.map.setTarget('map');
        layer.setSource(source);
    }

}

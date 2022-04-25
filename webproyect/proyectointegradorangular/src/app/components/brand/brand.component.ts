import { Component, OnInit } from '@angular/core';
import { BrandService } from 'src/app/core/services/brand/brand.service';
import { MatTableDataSource } from '@angular/material/table';
import { Brand } from 'src/app/core/model/brand/brand.model';

@Component({
  selector: 'app-brand',
  templateUrl: './brand.component.html',
  styleUrls: ['./brand.component.css']
})
export class BrandComponent implements OnInit {
  dataSource = new MatTableDataSource<any>();
  displayedColumns: string[] = ['idBrand', 'description', 'status'];
  marca:Brand = {idBrand:0, description:""}
  showList:boolean=true;

  constructor(private brandService:BrandService) { }

  ngOnInit(): void {
    this.loadBrand();
  }

  loadBrand(){
    this.brandService.getBrand().subscribe((resp)=>{
      console.log(resp);
      this.dataSource.data=resp;
    })
  }

  getBrandById(id:number){
    this.brandService.getBrandById(id).subscribe((resp)=>{
      console.log(resp);
      this.marca = resp;
    })
  }

  saveBrand(){
    this.brandService.saveBrand(this.marca).subscribe((resp)=>{
      console.log(resp)
      this.loadBrand();
      this.cleanBrand();
      this.returnToList();
    })
  }

  deleteBrand(id:number){
    this.brandService.deleteBrand(id).subscribe((res)=>{      
      console.log(res);
      this.loadBrand();
    })
  }

  validaObligatorios(element:any){
    //console.log(element);  
    var visible:boolean=false;
    if(element.description.length>0){
      visible = true;
    }else{
      visible=false;
    }  
    return visible;
  }

  cleanBrand(){
    this.marca.description="";
  }

  newBrand(){
    this.showList = false;
    this.cleanBrand();
  }

  editBrand(id:number){
    if(id>0){
      this.showList = false;
      this.getBrandById(id);
    }
  }  

  returnToList(){
    this.showList = true;
  }

}

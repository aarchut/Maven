import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from 'src/app/common/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list-grid.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products!: Product[];
  currentCategoryId!:number;
  constructor(private productService: ProductService,
    private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap.subscribe(()=> {
      this.listProducts(); 
    });
    
  }
  listProducts(){
    //check if id param is available 
    const hasCategoryId: boolean = this.route.snapshot.paramMap.has('id');

    //get the id param string and convert to number
    if (hasCategoryId){
      this.currentCategoryId= +this.route.snapshot.paramMap.get('id');
    }
    else{
      this.currentCategoryId = 1;
    }
    //get the products for the given id
    this.productService.getProductList(this.currentCategoryId).subscribe(
      data => {
        this.products = data;
      }
    )
  }

}

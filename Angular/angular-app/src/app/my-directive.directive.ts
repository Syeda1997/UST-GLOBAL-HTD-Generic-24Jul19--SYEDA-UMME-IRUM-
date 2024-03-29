import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elementRef: ElementRef) { 
   elementRef.nativeElement.style.background='crimson';
   elementRef.nativeElement.style.color='white';
   elementRef.nativeElement.style.padding='60px';
   elementRef.nativeElement.style.marginTop='70px';
   }
   
@HostBinding('style.background') background: string;

   @HostListener('mouseenter')
 mouseEnter(){
   this.background="aqua";
  //   console.log('mouse entered');
  //   alert('mouse entered');
  // this.elementRef.nativeElement.style.background='red';
  // this.elementRef.nativeElement.style.color='white';
  // this.elementRef.nativeElement.style.fontSize='20px';
   }
   @HostListener('mouseleave')
 mouseLeave(){
  this.background="purple";
  //   console.log('mouse entered');
  //    alert('mouse entered');
  // this.elementRef.nativeElement.style.background='green';
  // this.elementRef.nativeElement.style.color='red';
  // this.elementRef.nativeElement.style.fontSize='50px';
   }
}
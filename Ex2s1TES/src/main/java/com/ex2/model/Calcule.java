package com.ex2.model;

public class Calcule {
public int somme(int a,int b)
{
	return a+b;
	

}
public long produit(int a,int b)
{
	
return a*b;

}
public double factoriel(int a)
{
int fact=1;
for(int i=2;i<=a;i++)
	fact=fact*i;
return fact;


}
public int pgcd(int a,int b)
{
while(a!=b)
{
if(a>b)
	a=a-b;
else 
	b=b-a;
}
return a;



}
}

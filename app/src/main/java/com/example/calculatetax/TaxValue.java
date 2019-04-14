package com.example.calculatetax;
public class TaxValue {
    private float amount,t1,t2,totaltax,salary;

    public TaxValue(float amount)
    {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float case1()
    {
        salary=amount*12;
        totaltax= (float) (this.salary*0.01);
        return (totaltax);
    }
    public float case2() {
        salary=amount*12;
        t1= (float) (200000*0.01);
        totaltax= (float) (t1+((this.salary-200000)*(0.15)));
        return (totaltax);
    }

    public float case3() {
        salary=amount*12;
        t1= (float) (200000*0.01);
        t2= (float) ( t1+(150000*0.15));
        totaltax= (float) (t2+((this.salary-350000)*0.25));
        return (totaltax);
    }
}



















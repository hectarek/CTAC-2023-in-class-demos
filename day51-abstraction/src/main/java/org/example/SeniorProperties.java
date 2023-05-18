package org.example;

abstract class SeniorProperties {

    double basePay;
    double payMultiplier;

    void canNegotiate () {

    };
    double calculateSalary () {
      return this.basePay * this.payMultiplier;
    };

}

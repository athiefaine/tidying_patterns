# Tidying patterns steps

## VAT calculation

The initial code is as follows

```java
  return quanfity * itemPrice * 1.2;
```

### Explaining variable : explicit the concept of taxExcludedPrice

```java
  double taxExcludedPrice = quantity * itemPrice;
  return taxExcludedPrice * 1.2;
```

### One pile : separate the VAT rate value

```java
  double taxExcludedPrice = quantity * itemPrice;
  return taxExcludedPrice * (1 + 0.2);
```

### Explaining constant : explicit the concept of VAT rate

```java
  public static final double VAT_RATE = 0.2;

  ...

  double taxExcludedPrice = quantity * itemPrice;
  return taxExcludedPrice * (1 + VAT_RATE);
```

### Explaining variable : explicit the concept of taxIncludedPrice

```java
  public static final double VAT_RATE = 0.2;

  ...

  double taxExcludedPrice = quantity * itemPrice;
  double taxIncludedPrice taxExcludedPrice * (1 + VAT_RATE);
  return taxIncludedPrice;
```

### Extract helper : explicit the concept of tax application

Once the first tidyings have bee performed, optionality bring new tidyings like Extract helper.

```java
  public static final double VAT_RATE = 0.2;

  ...

  public double amount() {
    return applyTax(amountExcludingTax());
  }

  private double applyTax(double amountExcludingTax) {
    return amountExcludingTax * (1 + VAT_RATE);
  }

  private double amountExcludingTax() {
    return quantity * itemPrice;
  }
```

### What's next

Once those tidyings are done, our hard-learned understanding has been directly explicited in code and our business understanding has improved.
  
We may challenge the following points:
- is it relevant to handle VAT at OrderLine level instead of at Order level ?
  - there the business knowledge is mandatory: 
    - is VAT rate global (in this case it is preferable to move applyTax() to Order class) ?
    - is VAT rate specific to Item type or category ?
  - next to these questions we can improve business cohesion: where is it more relevant to handle VAT ?
- these questions are more visible thanks to the tidyings performed before ; optionality also lies in awareness and understanding of business rules and in the choices and questions that arise from them
- - as it was said about options, business mastery can be an excellent underlying



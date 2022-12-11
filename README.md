# Soluthevnik Backend :bar_chart:
Backend development for Soluthevnik company. 

## Soluthevnik Frontend :star2:
You can check this [repo!](https://github.com/SebastianWilches/Soluthevnik-Frontend)

## Objective :telescope:
Allow the administrator user to track inventory on sales and raw material orders.

## Technologies :bulb:
**Spring Boot, Java 17, Org JSON, Lombok, Oracle 11, Spring Data JPA, Argon2**

## Postman documentation :books:

You can check endpoints **documentation** [here!](https://documenter.getpostman.com/view/17256808/2s8YzMXQms)

## HTTP Request examples :black_nib:

:beginner: *POST http://localhost:8081/sale_order/save*
``` JSON
{
    "sale_order":{
        "k_id":12,
        "client_id":145,
        "admin_id":789456123,
        "total_price":0.0
    },
    "sale_order_items":[
        {
            "product_id":963,
            "q_quantity":5,
            "v_unit_price":45320.54
        },
        {
            "product_id":89,
            "q_quantity":3,
            "v_unit_price":65320.54
        }
    ]
}
```

:beginner: *POST http://localhost:8081/raw_material_order/save*
``` JSON
{
    "raw_material_order":{
        "k_id":9,
        "supplier_id":12345,
        "admin_id":789456123,
        "v_total_price":0.0
    },
    "raw_material_order_items":[
        {
            "raw_material_id":369,
            "q_quantity":5,
            "v_unit_price":45320.54
        },
        {
            "raw_material_id":458,
            "q_quantity":3,
            "v_unit_price":65320.54
        }
    ]
}
```

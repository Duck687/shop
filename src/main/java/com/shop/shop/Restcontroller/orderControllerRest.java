package com.shop.shop.Restcontroller;


import com.shop.shop.dto.OrderDto;
import com.shop.shop.entity.order;
import com.shop.shop.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class orderControllerRest {
    @Autowired
    private orderService OrderService;

    public orderControllerRest(orderService OrderService) {
        this.OrderService = OrderService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<order> createOrder(@RequestBody OrderDto order)
    {
        order Order = OrderService.createOrder(order.getId_order(), order.getId_user(), order.getId_product(), order.getCount_product());

        return ResponseEntity.status(HttpStatus.CREATED).body(Order);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public  ResponseEntity<order> updateOrder(@RequestBody OrderDto order)
    {
        order Order = OrderService.createOrder(order.getId_order(), order.getId_user(), order.getId_product(), order.getCount_product());
        return ResponseEntity.ok(Order);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  ResponseEntity<order> getOrderbyId(@PathVariable("id") Long id)
    {
        order Order = OrderService.getOrderById(id);
        return ResponseEntity.ok(Order);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public  void deleteOrderbyId(@PathVariable("id") Long id)
    {
        OrderService.deleteOrder(id);
    }

}


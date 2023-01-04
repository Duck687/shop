package com.shop.shop.Restcontroller;


import com.shop.shop.dto.BasketDto;
import com.shop.shop.entity.basket;
import com.shop.shop.service.basketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basket")
public class basketControllerRest {
    @Autowired
    private basketService BasketService;

    public basketControllerRest(basketService BasketService) {
        this.BasketService = BasketService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<basket> createBasket(@RequestBody BasketDto basket)
    {
        basket Bask = BasketService.createBasket(basket.getId_basket(), basket.getId_user(), basket.getId_product(), basket.getCount_product());

        return ResponseEntity.status(HttpStatus.CREATED).body(Bask);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public  ResponseEntity<basket> updateBasket(@RequestBody BasketDto basket)
    {
        basket Bask = BasketService.createBasket(basket.getId_basket(), basket.getId_user(), basket.getId_product(), basket.getCount_product());
        return ResponseEntity.ok(Bask);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  ResponseEntity<basket> getBaskbyId(@PathVariable("id") Long id)
    {
        basket Bask = BasketService.getBasketById(id);
        return ResponseEntity.ok(Bask);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public  void deleteBaskbyId(@PathVariable("id") Long id)
    {
       BasketService.deleteBasket(id);
    }

}

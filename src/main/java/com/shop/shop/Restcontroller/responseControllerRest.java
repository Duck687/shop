package com.shop.shop.Restcontroller;



import com.shop.shop.dto.ResponseDto;
import com.shop.shop.entity.response;
import com.shop.shop.service.responseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/response")
public class responseControllerRest {
    @Autowired
    private responseService service;

    public responseControllerRest(responseService service) {
        this.service = service;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<response> createProduct(@RequestBody ResponseDto response)
    {
        response Resp = service.createResponse(response.id_response, response.id_user, response.id_product);

        return ResponseEntity.status(HttpStatus.CREATED).body(Resp);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public  ResponseEntity<response> updateResponse(@RequestBody ResponseDto response)
    {
        response Resp = service.createResponse(response.id_response, response.id_user, response.id_product);

        return ResponseEntity.ok(Resp);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  ResponseEntity<response> getResponsebyId(@PathVariable("id") Long id)
    {
        response Prod = service.getOrderById(id);
        return ResponseEntity.ok(Prod);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteResponsebyId(@PathVariable("id") Long id)
    {
        service.deleteResponse(id);
    }

}

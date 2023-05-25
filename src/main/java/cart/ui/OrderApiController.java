package cart.ui;

import cart.domain.Member;
import cart.dto.OrderRequest;
import cart.dto.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/orders")
@Controller
public final class OrderApiController {

    @PostMapping
    public ResponseEntity<Void> order(final Member member,
                                      @RequestBody final OrderRequest request) {
        return ResponseEntity.created(URI.create("/orders/1")).build();
    }

    @GetMapping
    public ResponseEntity<List<OrderResponse>> findAll(final Member member) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> findBy(final Member member, @PathVariable Long id) {
        return ResponseEntity.ok().body(null);
    }
}

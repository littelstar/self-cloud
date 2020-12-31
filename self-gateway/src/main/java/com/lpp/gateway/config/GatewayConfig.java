package com.lpp.gateway.config;

import com.lpp.gateway.filter.RequestTimeFilter;
import com.lpp.gateway.filter.RequestTimeGatewayFilterFactory;
import com.lpp.gateway.filter.TokenFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Gateway配置
 * @author lpp
 * @date 2020/12/29
 */
// @Configuration
public class GatewayConfig {

    /**
     * 配置自定义全局过滤器
     * @return 过滤器示例
     */
    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

    // /**
    //  * 配置自定义过滤器
    //  */
    // @Bean
    // public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
    //     // @formatter:off
    //     return builder.routes()
    //             .route(r -> r.path("/customer/**")
    //                     .filters(f -> f.filter(new RequestTimeFilter())
    //                             .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
    //                     .uri("http://localhost:8081/customer")
    //                     .order(0)
    //                     .id("customer_filter_router")
    //             )
    //             .build();
    //     // @formatter:on
    // }

    /**
     * 配置自定义过滤器工厂
     * @return
     */
    @Bean
    public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

}

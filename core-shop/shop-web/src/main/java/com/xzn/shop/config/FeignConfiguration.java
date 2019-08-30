package com.xzn.shop.config;

//
//@Configuration
//public class FeignConfiguration {
//
//    @Bean
//    Logger.Level feignLoggerLevel(){
//        return Logger.Level.FULL;
//    }
//
//    @Bean
//    public FeignBasicRequestInterceptor feignBasicRequestInterceptor(){
//        return new FeignBasicRequestInterceptor();
//    }
//
//    public static class FeignBasicRequestInterceptor implements RequestInterceptor{
//
//        @Autowired
//        private HttpServletRequest httpServletRequest;
//
//        @Override
//        public void apply(RequestTemplate requestTemplate) {
//            String token = httpServletRequest.getHeader("accessToken");
//            if (!StringUtils.isEmpty(token)){
//                requestTemplate.header("token",httpServletRequest.getHeader("accessToken"));
//            }
//        }
//    }
//
//}

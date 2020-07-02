## Start
@SpringBootApplication
拆分
@Configuration
允许在上下文中注册额外的bean或导入其他配置类
@EnableAutoConfiguration
启用springboot自动配置机制
@ComponentScan
扫描被@Component(@Service,@Controller)注解的bean,默认扫描该类所在的包下所有的类

@PostMapping实际上就等价于 @RequestMapping(method = RequestMethod.POST)，同样的 @DeleteMapping ,@GetMapping也都一样，常用的 HTTP Action 都有一个这种形式的注解所对应。
@PathVariable :取url地址中的参数。@RequestParam url的查询参数值。
@RequestBody:可以将 HttpRequest body 中的 JSON 类型数据反序列化为合适的 Java 类型。
ResponseEntity: 表示整个HTTP Response：状态码，标头和正文内容。我们可以使用它来自定义HTTP Response 的内容。
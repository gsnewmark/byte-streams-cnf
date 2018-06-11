# byte-streams-cnf

Minimal reproducible case for [byte-streams#34](https://github.com/ztellman/byte-streams/issues/34).

## Usage

```
⇒  lein do clean, compile :all
Compiling byte-streams-cnf.lib
Compiling byte-streams-cnf.conversions
nil
Exception in thread "main" java.lang.ExceptionInInitializerError, compiling:(/tmp/form-init6943253397882119627.clj:1:73)
	at clojure.lang.Compiler.load(Compiler.java:7526)
	at clojure.lang.Compiler.loadFile(Compiler.java:7452)
	at clojure.main$load_script.invokeStatic(main.clj:278)
	at clojure.main$init_opt.invokeStatic(main.clj:280)
	at clojure.main$init_opt.invoke(main.clj:280)
	at clojure.main$initialize.invokeStatic(main.clj:311)
	at clojure.main$null_opt.invokeStatic(main.clj:345)
	at clojure.main$null_opt.invoke(main.clj:342)
	at clojure.main$main.invokeStatic(main.clj:424)
	at clojure.main$main.doInvoke(main.clj:387)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.lang.Var.applyTo(Var.java:702)
	at clojure.main.main(main.java:37)
Caused by: java.lang.ExceptionInInitializerError
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:348)
	at clojure.lang.RT.classForName(RT.java:2204)
	at clojure.lang.RT.classForName(RT.java:2213)
	at clojure.lang.RT.loadClassForName(RT.java:2232)
	at clojure.lang.RT.load(RT.java:450)
	at clojure.lang.RT.load(RT.java:426)
	at clojure.core$load$fn__6548.invoke(core.clj:6046)
	at clojure.core$load.invokeStatic(core.clj:6045)
	at clojure.core$load.doInvoke(core.clj:6029)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$load_one.invokeStatic(core.clj:5848)
	at clojure.core$compile$fn__6553.invoke(core.clj:6056)
	at clojure.core$compile.invokeStatic(core.clj:6056)
	at clojure.core$compile.invoke(core.clj:6048)
	at user$eval164$fn__173.invoke(form-init6943253397882119627.clj:1)
	at user$eval164.invokeStatic(form-init6943253397882119627.clj:1)
	at user$eval164.invoke(form-init6943253397882119627.clj:1)
	at clojure.lang.Compiler.eval(Compiler.java:7062)
	at clojure.lang.Compiler.eval(Compiler.java:7052)
	at clojure.lang.Compiler.eval(Compiler.java:7052)
	at clojure.lang.Compiler.load(Compiler.java:7514)
	... 12 more
Caused by: java.lang.ClassCastException: byte_streams.graph.Type cannot be cast to byte_streams.graph.Type
	at byte_streams.graph.ConversionGraph.assoc_conversion(graph.clj:122)
	at byte_streams.graph$fn__2619$G__2581__2625.invoke(graph.clj:91)
	at byte_streams.graph$fn__2619$G__2580__2632.invoke(graph.clj:91)
	at clojure.lang.AFn.applyToHelper(AFn.java:171)
	at clojure.lang.AFn.applyTo(AFn.java:144)
	at clojure.lang.Atom.swap(Atom.java:79)
	at clojure.core$swap_BANG_.invokeStatic(core.clj:2347)
	at clojure.core$swap_BANG_.doInvoke(core.clj:2337)
	at clojure.lang.RestFn.invoke(RestFn.java:529)
	at byte_streams_cnf.conversions$fn__3647.invokeStatic(conversions.clj:4)
	at byte_streams_cnf.conversions$fn__3647.invoke(conversions.clj:4)
	at byte_streams_cnf.conversions__init.load(Unknown Source)
	at byte_streams_cnf.conversions__init.<clinit>(Unknown Source)
	... 34 more
Compilation failed: Subprocess failed
```

## License

Copyright © 2018 Ivan Kryvoruchko

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

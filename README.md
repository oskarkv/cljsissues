Note: Includes a .dir-locals.el to choose figwheel-main with the dev build on `cider-jack-in-clojurescript`.

I have 3 issues with CIDER and/or ClojureScript. I don't really know what causes each issue, but it would be great if anyone could shed some light on the issues and tell me if you have the same problem, or better yet, how to fix them. Together they make my quality of life suffer.

EDIT: I'm using figwheel-main, but also tried with nashorn and issue 1 and 2 are present there too.

### Issue 1

When I have `(assert false "HELLO")` or `(throw "HELLO")` in a `.cljs` file, and do `cider-load-buffer` I don't see those messages. It's as if everything went fine.

If I eval those forms with `cider-eval-defun-at-point` then I see the error messages in Emacs.

I'm using figwheel-main, and I see the errors in my browser console. But I would like to see them in Emacs too.

### Issue 2

My ClojureScript REPL in CIDER does not pretty print. If I start both a Clojure and a ClojureScript REPL with `cider-jack-in-clj&cljs`, the Clojure one pretty prints but not the ClojureScript one.

I have `cider-print-fn` set to `'pprint`, the default.

### Issue 3

If I evaluate an expression at the REPL in ClojureScript, and I get an error somewhere in it, then I don't see any output from `println`s that happened before the error. Makes debugging really hard.
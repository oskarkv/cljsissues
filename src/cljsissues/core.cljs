(ns cljsissues.core)

;; Issue 2: The CLJS REPL does not pretty print for me.

;; Issue 1: Evaling the whole namespace with cider-load-buffer does not give any
;; errors in Emacs, just in the browser console (for both failed asserts and
;; throws).

(assert false "HELLO")

(throw "HELLO")

;; This will not be defined with cider-load-buffer if there is a failed assert
;; or throw above.
(def something 123)

;; Issue 3: Running test-println below does not print "testing println", either
;; in browser console or Emacs.
(defn test-println []
  (println "testing println")
  (throw "ERROR IN test-println"))

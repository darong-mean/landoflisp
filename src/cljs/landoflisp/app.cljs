(ns landoflisp.app
  (:require [landoflisp.guess-my-number]))

(defn init []
  (let [c (.. js/document (createElement "DIV"))]
    (aset c "innerHTML" "<p>i'm dynamically created</p>")
    (.. js/document (getElementById "container") (appendChild c))))

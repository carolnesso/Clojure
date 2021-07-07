(ns aula.core
  (:gen-class))

(def transacoes
  [{:nome "venda" :valor 12.99}
   {:nome "compra" :valor -100.}
   {:nome "venda" :valor 123.45}
   {:nome "compra" :valor -1.99}
   ])

(defn -main
  [& args]
  (println "Hello, World!"))

 ; defn define funções
 ;ja def define variaveis 
(ns aula.core
  (:gen-class))

; Software bancário 

(defn criar-transacao
  [nome valor]
  {:nome nome :valor valor})

(def transacoes
  [
   (criar-transacao "venda" 12.99)
   (criar-transacao "venda" 123.45)
   (criar-transacao "compra" -100)
   (criar-transacao "compra" -1.99)
   ])

(defn get-valores-a
  [transacoes-real]
  (map :valor transacoes-real))

(defn get-valores-b
  [transacoes-real]
  (map (fn[x] (:valor x)) transacoes-real))

(defn get-valores-c
  [transacoes-real]
  (map #(:valor %) transacoes-real))

; map == for it = "o que ele vai executar" "base de dados"

(defn -main
  [& args]
  (println "Hello, World!"))

; defn define funções
; def define variaveis 
; nil == NULL == none

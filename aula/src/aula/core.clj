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

(defn calcula-valor
  [transacoes-real]
  (reduce + (get-valores-a transacoes-real)))

(defn eh-uma-venda?
  [transacoes-real]
  (= "venda" (:nome transacoes-real)))

(defn eh-uma-compra?
  [transacoes-real]
  (= "compra" (:nome transacoes-real)))

(defn get-vendas
  [transacoes-real]
  (filter eh-uma-venda? transacoes-real))

(defn get-compras
  [transacoes-real]
  (filter eh-uma-compra? transacoes-real))


(comment 
  (defn get-compras
  [transacoes-real]
  (filter #(not (eh-uma-venda? %)) transacoes-real))
)


(defn -main
  [& args]
  (println "Hello, World!"))


(comment
 defn define funções
 def define variaveis 
 nil == NULL == none 
 map == for it = "o que ele vai executar" "base de dados"
 reduce = "o que vai executar" "base de dados" tenta juntar todos os elementos em um só
 )


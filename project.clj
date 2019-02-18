(defproject playground "0.2.0-SNAPSHOT"
  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  [[org.clojure/clojure "1.10.0"]
   [org.clojure/clojurescript "1.10.520"]
   [reagent "0.8.1"
    :exclusions [cljsjs/react
                 cljsjs/react-dom
                 cljsjs/react-dom-server
                 cljsjs/create-react-class]]]

  :source-paths ["src"]

  :aliases
  {"fig"        ["trampoline" "run" "-m" "figwheel.main"]
   "fig:dev"    ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]
   "fig:dev-pc" ["trampoline" "run" "-m" "figwheel.main" "-pc" "-b" "dev"]}

  :profiles
  {:dev
   {:resource-paths ["target"]
    :clean-targets ^{:protect false} ["target"]
    :dependencies [[com.bhauman/figwheel-main "0.2.0"]
                   [com.bhauman/rebel-readline-cljs "0.1.4"]]}}

  ;; :cljsbuild
  ;; {:builds
  ;;  [{:id "dev"
  ;;    :figwheel true
  ;;    :source-paths ["src"]
  ;;    :compiler {:main playground.app.core
  ;;               :asset-path "js/out"
  ;;               :output-to "resources/public/js/app.js"
  ;;               :output-dir "resources/public/js/out"
  ;;               ;; currently not possible to use DEV React build
  ;;               ;; due to known bug in closure compiler
  ;;               :closure-defines {process.env/NODE_ENV "production"}
  ;;               :install-deps true
  ;;               :npm-deps {:react "16.4.0"
  ;;                          :react-dom "16.4.0"
  ;;                          :create-react-class "15.6.3"
  ;;                          :rmwc "1.6.4"}}}]}
  )

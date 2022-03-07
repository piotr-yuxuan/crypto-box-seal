(defproject com.github.piotr-yuxuan/crypto-box-seal (-> "./resources/crypto-box-seal.version" slurp .trim)
  :description "Libsodium wrapper to encrypt GitHub Action secrets with `crypto_box_seal`"
  :url "https://github.com/piotr-yuxuan/crypto-box-seal"
  :license {:name "European Union Public License 1.2 or later"
            :url "https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12"
            :distribution :repo}
  :scm {:name "git"
        :url "https://github.com/piotr-yuxuan/crypto-box-seal"}
  :pom-addition [:developers [:developer
                              [:name "胡雨軒 Петр"]
                              [:url "https://github.com/piotr-yuxuan"]]]
  :dependencies [[techascent/tech.jna "4.05"]]
  :profiles {:github {:github/topics ["github" "actions" "github-actions" "sodium" "libsodium"
                                      "crypto-box-seal" "crypto_box_seal" "crypto"]}
             :dev {:global-vars {*warn-on-reflection* true}
                   :jvm-opts ["--add-modules=jdk.incubator.foreign"
                              "--enable-native-access=ALL-UNNAMED"]}}
  :deploy-repositories [["clojars" {:sign-releases false
                                    :url "https://clojars.org/repo"
                                    :username :env/WALTER_CLOJARS_USERNAME
                                    :password :env/WALTER_CLOJARS_PASSWORD}]
                        ["github" {:sign-releases false
                                   :url "https://maven.pkg.github.com/piotr-yuxuan/crypto-box-seal"
                                   :username :env/GITHUB_ACTOR
                                   :password :env/WALTER_GITHUB_PASSWORD}]])

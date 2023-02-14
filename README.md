# rafaeldelboni/helix-scratch

Minimal Helix Scratch Template.

# TL;DR
To use this template:
```bash
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:git/url "https://github.com/rafaeldelboni/helix-scratch" :git/sha "8e4eb30" :git/tag "v0.1.1"}}}' -X:new :template rafaeldelboni/helix-scratch :name myusername/mycoolsite
```

# Requirements

## Install deps-new
To you use this template you need to have installed `deps-new` in your workflow.

### Traditional installation
```bash
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.4.13"}' :as new
```

### Optimal installation
This is just a personal preference, but I preffer install tools adding the following
as `:alias` into your local `~/.clojure/deps.edn` file:
```clojure
:new {:extra-deps {io.github.seancorfield/deps-new
                   {:git/url "https://github.com/seancorfield/deps-new"
                    :git/sha "21bb2c8e9b898f6b93506cd128314585a98cc962"}}
      :exec-fn org.corfield.new/create
      :exec-args {:template "app"}}
```

## Usage

### Git Remote
```bash
  # traditional install
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:git/url "https://github.com/rafaeldelboni/helix-scratch" :git/sha "8e4eb30" :git/tag "v0.1.1"}}}' -Tnew create :template rafaeldelboni/helix-scratch :name myusername/mynewproject

  # optimal install
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:git/url "https://github.com/rafaeldelboni/helix-scratch" :git/sha "8e4eb30" :git/tag "v0.1.1"}}}' -X:new :template rafaeldelboni/helix-scratch :name myusername/mycoolsite
```

### Local
Clone this repo, navigate into it's folder and then run:
```bash
  # traditional install
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:local/root "."}}}' -Tnew create :template rafaeldelboni/helix-scratch :name myusername/mycoollib

  # optimal install
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:local/root "./"}}}' -X:new :template rafaeldelboni/helix-scratch :name myusername/mycoolsite
```

# Contributing

## Build / Deploy

```bash
  # Build
  clj -X:build :lib rafaeldelboni/helix-scratch :version '"0.1.0"'
  # Deploy
  env CLOJARS_USERNAME=username CLOJARS_PASSWORD=clojars-token clj -X:deploy :lib delboni/helix-scratch :version '"0.1.0"'
```

# License

Copyright © 2023 Rafael Delboni

This is free and unencumbered software released into the public domain.
For more information, please refer to http://unlicense.org

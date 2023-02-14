# rafaeldelboni/helix-scratch

Minimal Helix Scratch Template.

# TL;DR
To use this template:
```bash
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:git/url "https://github.com/rafaeldelboni/helix-scratch" :git/sha "3e46840584a95be58f52ac7c0675fdd99fae2537"}}}' -X:new :template rafaeldelboni/helix-scratch :name myusername/mycoolsite
```

# Requirements

## Install deps-new
To you use this template you need to have installed `deps-new` in your workflow.

### Traditional installation
```bash
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.4.13"}' :as new
```

### Wrap installation
I've created an [wrap](https://github.com/rafaeldelboni/deps-new-wrap) over deps-new to simplify some new commands you can use this wrapper
by tools adding the following as `:alias` into your local `~/.clojure/deps.edn` file:
```clojure
:new {:extra-deps {cc.delboni/deps-new-wrap
                   {:git/url "https://github.com/rafaeldelboni/deps-new-wrap"
                    :git/sha "bed5e0443aba7c33c00f4de57280b91f050c7cd0"}}
      :exec-fn cc.delboni.main/new}
```

## Usage

### Git Remote
```bash
  # traditional
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:git/url "https://github.com/rafaeldelboni/helix-scratch" :git/sha "3e46840584a95be58f52ac7c0675fdd99fae2537"}}}' -Tnew create :template rafaeldelboni/helix-scratch :name myusername/mynewproject

  # wrap
  clojure -X:new :gh rafaeldelboni/helix-scratch :name myusername/mycoolsite
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

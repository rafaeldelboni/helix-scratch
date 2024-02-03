# rafaeldelboni/helix-scratch

Minimal Helix Scratch Template.

# TL;DR
To use this template:
```bash
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:git/url "https://github.com/rafaeldelboni/helix-scratch" :git/sha "08304a193e0b3ec4c3a2e31bd0601843d59e13d9"}}}' -X:new :template rafaeldelboni/helix-scratch :name myusername/mycoolsite
```

# Requirements

## Install deps-new
To you use this template you need to have installed `deps-new` in your workflow.

### Traditional installation
```bash
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.7.0"}' :as new
```

### Wrap installation
I've created an [wrap](https://github.com/rafaeldelboni/deps-new-wrap) over deps-new to simplify some new commands you can use this wrapper
by tools adding the following as `:alias` into your local `~/.clojure/deps.edn` file:
```clojure
:new {:extra-deps {cc.delboni/deps-new-wrap
                   {:git/url "https://github.com/rafaeldelboni/deps-new-wrap"
                    :git/sha "34557a5f5d98b5815b612c12ca5c407d324aa510"}}
      :exec-fn cc.delboni.main/new}
```

## Usage

### Git Remote
```bash
  # traditional
  clojure -Sdeps '{:deps {rafaeldelboni/helix-scratch {:git/url "https://github.com/rafaeldelboni/helix-scratch" :git/sha "08304a193e0b3ec4c3a2e31bd0601843d59e13d9"}}}' -Tnew create :template rafaeldelboni/helix-scratch :name myusername/mynewproject

  # wrap
  clojure -X:new :gh rafaeldelboni/helix-scratch :name myusername/mycoolsite
```

# License

Copyright © 2023 Rafael Delboni

This is free and unencumbered software released into the public domain.
For more information, please refer to http://unlicense.org

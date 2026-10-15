# Project: Lume, a local-first Android music player

## Goal

A beautiful, minimal, private music player for Android that plays audio files stored on the device, with time-synced lyrics. Quality over quantity: few features, polished.

## Stack (do not change without asking)

Kotlin, Jetpack Compose (Material 3), Media3 (ExoPlayer + MediaSession), Room, Coil for images. Min SDK 26.

## Non-negotiable rules

1. Privacy: no analytics, ads, crash-reporting, or tracking libraries. Only permissions allowed: read audio media, post notifications, internet (lyrics lookup only). No accounts.
2. Keep it small: add a dependency only if truly necessary, and explain why. Prefer the standard library and the libraries listed above.
3. No dead code: no unused files, functions, resources, placeholder screens, commented-out code, or "future use" scaffolding. If something is not used by the current phase, do not create it.
4. Simple architecture: one module, a few clearly named packages (`data`, `playback`, `ui`, `lyrics`). Single-direction state flow with ViewModels. No heavy frameworks, no unnecessary abstraction layers or interfaces with one implementation.
5. Readable code: small functions, clear names, comments only where the reason is not obvious.
6. Respect the existing code: before changing anything, read the relevant files. Do not rewrite working parts. Make the smallest change that achieves the goal.
7. Animations: only those listed in `docs/DESIGN.md`. Honor the system "remove animations" setting. Do not add animation anywhere else.
8. Every phase must build cleanly with no warnings I should worry about, and run on a real device.
9. At the end of every phase: summarize what changed, list any assumptions, and tell me exactly how to run it. Do not start the next phase.
10. Before finishing any phase, run a debug build (assembleDebug) and fix any errors yourself. Never report a phase as complete if the project does not build.

## Source of truth

Design and behavior live in `docs/DESIGN.md`. If a request conflicts with it, ask me before proceeding.

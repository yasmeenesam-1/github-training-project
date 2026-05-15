# Portfolio App

A personal portfolio Android app built as the final submission for the **Git & GitHub training assignment**. The app showcases a profile section, a skills list, and a list of personal projects, all in a single scrollable screen with a custom Material 3 theme.

---

## Description

The Portfolio App is a single-screen Android application written in **Kotlin** with **Jetpack Compose**. It is designed to look like a small "about me" page and contains:

- A center-aligned top app bar (navbar)
- A profile header with avatar, name, role, and a short bio
- A "Skills" section listing technologies the student is comfortable with
- A "Projects" section listing recent personal projects with their tech stack
- A footer with copyright information

The project also demonstrates a full Git workflow: multiple organized commits, a feature branch, a pull request merged into `main`, and a tracked issue.

---

## Technologies Used

- **Kotlin** – primary language
- **Jetpack Compose** – declarative UI
- **Material 3** – components and theming
- **Android Gradle Plugin (Kotlin DSL)** – build system
- **Git & GitHub** – version control and collaboration

---

## Screenshots

Screenshots are stored in the `docs/screenshots/` folder.

| Screen | File |
| --- | --- |
| Profile header | `docs/screenshots/01-profile.png` |
| Skills section | `docs/screenshots/02-skills.png` |
| Projects section | `docs/screenshots/03-projects.png` |

> _Add screenshots after running the app on an emulator or device._

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yasmeenesam-1/github-training-project.git
   ```
2. Open the project folder in **Android Studio** (Hedgehog or newer recommended).
3. Wait for Gradle to finish syncing.
4. Select an emulator (API 26+) or connect a physical device.
5. Press **Run ▶** to build and launch the app.

---

## Project Structure

```
github-training-project/
├── app/
│   └── src/main/
│       ├── java/com/example/myapplication/
│       │   ├── MainActivity.kt          # All composables for the portfolio screen
│       │   └── ui/theme/                # Color, Type, and Theme definitions
│       ├── res/                         # Drawables, strings, themes, icons
│       └── AndroidManifest.xml
├── build.gradle.kts                     # Top-level Gradle config
├── settings.gradle.kts
├── gradle/                              # Gradle wrapper and version catalog
└── README.md
```

---

## Git Workflow

This project follows a simple but complete Git workflow:

- **Multiple organized commits** on `main` covering each feature (navbar, profile, cards, styling, footer)
- A dedicated **feature branch** `feature/design-update` for the improved header design
- A **Pull Request** (#3) reviewing the design changes before they were merged into `main`
- **Issues** used to track planned improvements (e.g. _Improve UI Design_)

---

## Student

**Yasmeen Esam Harara** – Mobile Developer student

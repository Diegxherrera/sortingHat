# Changelog

## (2.2-alpha) - 27/11/2023

### Added
- `houseChecker()` method that implements the logic to infer the house of the player.
- Now, `nextPhaseKey` implements the necessary logic to process next phases that lead to results.

## (2.1-alpha) - 26/11/2023

### Added
- Now, `ventanaDePreguntas()` works for both games: Sorting Hat + Muggle or Wizard.
  - Sorting hat now has a score counter for each of the HP houses.
  - Button action listeners have logic to continue each game.

### Changed
- Phases system got a redesign and now only `DataManger` class will be handling phases and data stuff.
- Simplified process to get data by making 3 function redesigns in `DataManager`.
- Using functions to get story phases from `Preguntas` in `DataManager`.

### Fixed
- Spelling errors when naming several variables (Not complying with conventions)

### Removed
- `SortingHat` class does no longer exist, its tasks have been refactored.

## (2.0-alpha) - 23/11/2023

### Added
- Phases system in `MuggleOrWizard` class has been done.
- Connection of the Phases system, data sets and sorting hat with the UI on the works.
- New classes: DataManager, GameController and Interface to use the MVC pattern.

## (1.0.3-alpha) - 09/11/2023

### Added
- Finished the four results screen (each one for a different house) and added small changes to sizes and fonts.

## (1.0.2-alpha) - 02/11/2023

### Added
- Interface now has a results page and changes to variables name has been made.

## (1.0.1-alpha) - 02/11/2023

### Added
- Interface class added featuring welcome page and questions page.

## (1.0-alpha) - 02/11/2023

### Added
  - Created the phases class with its methods and fields.
  - Created a 2D array solution for question-answer system of the sorting hat main program.
  - Created a JSON containing the phases created yet. JSON that will be accessed to retrieve data.
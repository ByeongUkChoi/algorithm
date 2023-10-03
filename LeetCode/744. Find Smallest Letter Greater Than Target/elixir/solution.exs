defmodule Solution do
  @spec next_greatest_letter(letters :: [char], target :: char) :: char
  def next_greatest_letter(letters, target) do
    letters
    |> Enum.filter(&(&1 > target))
    |> case do
      [] -> hd(letters)
      greater_letters -> Enum.min(greater_letters)
    end
  end
end

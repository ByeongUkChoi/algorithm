defmodule Solution do
  @spec can_construct(ransom_note :: String.t(), magazine :: String.t()) :: boolean
  def can_construct(ransom_note, magazine) do
    to_charlist(ransom_note) -- to_charlist(magazine) == []
  end
end
